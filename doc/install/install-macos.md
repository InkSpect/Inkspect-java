# Install Inkspect on MacOS
  
- Install JDK version that matches the analyzed source code

- Download latest release
```
curl -L \
https://github.com/InkSpect/Inkspect-java/releases/latest/download/inkspect-java-darwin-aarch64 \
--output inkspect-java
```

- Make executable
```
chmod u+x inkspect-java
```

**Warning:** this binary is not signed, so you have to add `Terminal` as a system Developer Tool in System Settings.

- Open System Settings
- Search for "developer"
- Click Allow applications to use developer tools in the sidebar.