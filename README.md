# DeckPlugin

A template for [Steam Deck Plugin Loader](https://github.com/SteamDeckHomebrew/decky-loader) plugins in Kotlin/Multiplatform.
Any problems, bugs or feature requests can be reported [on the issue tracker](https://youtrack.martmists.com/issues/DK).
Latest compatible `decky-frontend-lib`: [3.1.3 @ 0d248f39](https://github.com/SteamDeckHomebrew/decky-frontend-lib/commit/0d248f3987ee498c0cb55a4db1f099edf8288de3)

### Details

The backend is written in Kotlin/Native, and produces a binary that can be executed from your Python plugin at any time.
The frontend is written in Kotlin/JS, and produces a JS bundle that will be loaded into the Steam Deck UI.
Miscellaneous files are located in src/plugin, which are used solely by the plugin loader.
There is also a Python Native Extension which can be imported from the plugin, written using the [KPy Compiler Plugin](https://github.com/martmists-gh/kpy-plugin).

### Building

To build your plugin, run the following commands:

```bash
# First time:
$ cd src
$ docker build . -t build-image
$ cd ..

# Every time:
$ scripts/build.sh 
```

Additionally, any git tags created will trigger a GitHub Actions workflow which will build the plugin and upload it as artifact.

### License

This project is licensed under the [BSD 3-Clause License](LICENSE).
