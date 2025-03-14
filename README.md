# Modular Navigation System in Android with Jetpack Navigation

## Introduction

This project demonstrates a **modular navigation system** using **Jetpack Navigation** in Android. The system follows a **feature-based modular architecture**, enabling scalable and maintainable navigation across different modules and screens.

For a detailed explanation of the architecture and implementation, refer to the Medium article:  
[Modular Navigation System in Android with Jetpack Navigation](https://medium.com/@ragnorak-dev/modular-navigation-system-in-android-with-jetpack-navigation-ad0cc0fbc0bb)

## Project Structure

The project is organized into multiple modules to ensure **separation of concerns** and **modularity**:

- **`app`**: Contains the main activity and hosts the navigation system.
- **`core:navigation`**: Defines shared navigation routes and public destinations accessible by multiple modules.
- **`feature:feature1`**: Implements screens and navigation routes specific to Feature1.
- **`feature:feature2`**: Implements screens and navigation routes specific to Feature2.

## Key Features

- ✅ **Jetpack Navigation** for efficient navigation management.
- ✅ **Modular architecture** to enhance scalability and maintainability.
- ✅ **Encapsulation of routes** to separate public and private destinations within each module.
- ✅ **Independent navigation definitions** within feature modules.

## How to Run the Project

1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/your-repo-name.git

2. Open the project in Android Studio.
3.	Build and run the application on an emulator or device.

## Contribution

💡 Contributions are welcome! If you find any issues or want to improve the project, feel free to open an issue or submit a pull request.

## License

📜 This project is licensed under the MIT License. See the LICENSE file for more details.