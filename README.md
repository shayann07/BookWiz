# BookWiz

**BookWiz** is a modern Android application that lets you instantly search, discover and browse books via the [Google Books API](https://developers.google.com/books).  Powered by a clean architecture and MVVM pattern, the app delivers a smooth, intuitive experience for finding titles, authors and bestsellers.

## 📚 Features

- **Instant search** – type a title, author or keyword and see results update in real time.
- **Book discovery** – browse popular and top‑selling books from Google Books.
- **Detailed book pages** – view cover images, descriptions, authors, publishers and published dates.
- **Add to favourites** – save books you love for quick access later (local persistence).
- **Responsive UI** – built with Material Design components and dark/light theme support.

## 🛠️ Tech Stack

- **Languages**: Java & Kotlin
- **Architecture**: MVVM (ViewModel, LiveData)
- **Network**: Retrofit/OkHttp to call the Google Books REST API
- **Dependency Injection**: Hilt/Dagger2
- **Image Loading**: Glide/Picasso for book covers
- **Database**: Room (SQLite) for favourites cache
- **Build & Tools**: Gradle, AndroidX, Material Components

## 🚀 Getting Started

1. **Clone the repository**

   ```bash
   git clone https://github.com/shayann07/BookWiz.git
   cd BookWiz
   ```

2. **Obtain a Google Books API key** (optional)

   The app works without an API key but is subject to lower quota.  For production use, generate an API key from the [Google Books API console](https://developers.google.com/books/docs/v1/using#APIKey).

   - Copy your API key into `local.properties` or a `secrets.properties` file and reference it in the network module.

3. **Open in Android Studio**

   - File → Open and select the project root.
   - Let Gradle sync and download dependencies.

4. **Run the app**

   - Connect an Android device or start an emulator.
   - Click **Run** to build and launch BookWiz.

## 📄 License

This project is licensed under the [MIT License](LICENSE).  Feel free to fork and contribute.

<!-- gitpulse:contribution index="1" timestamp="2026-05-03" -->
<!-- gitpulse:contribution index="2" timestamp="2026-05-03" -->
<!-- gitpulse:contribution index="3" timestamp="2026-05-03" -->
<!-- gitpulse:contribution index="4" timestamp="2026-05-03" -->
<!-- gitpulse:contribution index="5" timestamp="2026-05-03" -->
<!-- gitpulse:contribution index="6" timestamp="2026-05-03" -->
<!-- gitpulse:contribution index="7" timestamp="2026-05-03" -->
<!-- gitpulse:contribution index="8" timestamp="2026-05-03" -->
<!-- gitpulse:contribution index="9" timestamp="2026-05-03" -->
<!-- gitpulse:contribution index="10" timestamp="2026-05-03" -->
<!-- gitpulse:contribution index="11" timestamp="2026-05-03" -->
<!-- gitpulse:contribution index="12" timestamp="2026-05-03" -->
<!-- gitpulse:contribution index="13" timestamp="2026-05-03" -->
<!-- gitpulse:contribution index="14" timestamp="2026-05-03" -->
<!-- gitpulse:contribution index="15" timestamp="2026-05-03" -->