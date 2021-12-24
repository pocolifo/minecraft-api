# Minecraft API (for MC Java)

Java library to access various parts of the Minecraft API (currently launcher metadata)

## Features

- Get all Minecraft versions available
- Get metadata of a specific Minecraft version (libraries required, binary downloads, etc.)


## Coming Soon

- Other Mojang APIs (skin API, name API, etc.)


# Getting Started

Quick example

```java
// initalize API object
MinecraftAPI api = new MinecraftAPI(null);

// prepare a request to get Minecraft version list
ManifestRequest request = new ManifestRequest();

// make the request
try {
  ManifestTemplate manifest = request.getResponse(api);

  // do whatever with the data
  System.out.println(manifest.latest.release);
  System.out.println(manifest.latest.snapshot);

  for (ManifestTemplate.Version version : manifest.versions) {
    // version metadata
    System.out.println(version.id);
  }
} catch (Exception e) {
  // could not make request
  // catch the exception
}
```
