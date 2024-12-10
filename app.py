import os
if __name__ == "__main__":
    print(f"Application Version: {os.getenv('APP_VERSION', 'unknown')}")
