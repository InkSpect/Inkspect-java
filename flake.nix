{
  description = "A Nix-flake-based Scala development environment";

  inputs = {
    nixpkgs.url = "https://flakehub.com/f/NixOS/nixpkgs/0.1";
    nixpkgs-pinned.url = "github:NixOS/nixpkgs/27ec1c9b87f5906fcf94c1e7b2c50ca6c0fc8de5";
  };

  outputs = { self, nixpkgs, nixpkgs-pinned }:
    let
      javaVersion = 21;

      supportedSystems = [ "x86_64-linux" "aarch64-linux" "x86_64-darwin" "aarch64-darwin" ];
      forEachSupportedSystem = f: nixpkgs.lib.genAttrs supportedSystems (system: f {
        pkgs = import nixpkgs {
          inherit system;

        };
        pkgsPinned = import nixpkgs-pinned { inherit system; };
      });
    in
    {
      overlays.default = final: prev:
        let
          jdk = prev."jdk${toString javaVersion}";
        in
        {
          sbt = prev.sbt.override { jre = jdk; };
          scala = prev.scala_3.override { jre = jdk; };
        };

      devShells = forEachSupportedSystem ({ pkgs, pkgsPinned }: {
        default = pkgs.mkShell {
          packages = with pkgs; [
            bash
            pkgsPinned.graalvm-ce 
            scala
            sbt 
            coursier
          ];
        };
      });
    };
}
