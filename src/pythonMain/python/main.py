import pathlib
import subprocess
import asyncio
import os
import sys


HOME_DIR = str(pathlib.Path(os.getcwd()).parent.parent.resolve())
PARENT_DIR = str(pathlib.Path(__file__).parent.resolve())
sys.path.append(PARENT_DIR)
import example_plugin
sys.path.pop(-1)


class Plugin:
    def __init__(self):
        self.backend_process = None

    async def _main(self):
        # Start backend process
        self.backend_process = subprocess.Popen(
            [f"{PARENT_DIR}/bin/backend"],
        )

        # Run plugin main
        example_plugin.main()
