# BookWiz

Kotlin Android book browser with paged Google Books results, debounced search, cover images, and pull-to-refresh.

## Overview

BookWiz is a small Android client for the public Google Books API. The main screen loads a two-column paged feed using the query `bestsellers`, then switches to paged search results as the user types. Each result card displays a cover, title, and author information.

The project demonstrates Retrofit networking, Moshi response mapping, Paging 3, Kotlin Flow, ViewModel state, Coil image loading, and View Binding. It does not currently include book detail pages, favorites, local persistence, authentication, or dependency injection.

## Features

- Paged Google Books API requests
- Two-column book grid
- Debounced inline search after 350 milliseconds
- Featured query shown when the search field is empty
- Pull-to-refresh through `SwipeRefreshLayout`
- Book cover loading with HTTPS normalization and rounded corners
- Title and author display
- Paging load-state integration for refresh indication

## Tech Stack

- Kotlin
- Android SDK and XML layouts
- View Binding
- AndroidX ViewModel and Lifecycle
- Kotlin coroutines and Flow
- Paging 3
- Retrofit
- Moshi with generated adapters
- Coil
- Material Components

## How It Works

`MainActivity` creates a paged grid and initially collects the ViewModel's featured flow. Text changes are debounced before requesting a new flow for the entered query. `BooksRepository` creates a `Pager` backed by a custom `PagingSource`, which sends `startIndex`, `maxResults`, and `printType=books` to the Google Books volumes endpoint. `BooksAdapter` renders the returned cover, title, and authors.

## Project Structure

```text
app/src/main/java/com/example/bookfinder/
|-- data/
|   |-- model/       # Google Books response models
|   |-- network/     # Retrofit API and client creation
|   `-- repository/  # Pager and PagingSource
`-- ui/
    |-- MainActivity.kt
    |-- MainViewModel.kt
    |-- BooksAdapter.kt
    |-- SearchActivity.kt
    `-- GridSpacingItemDecoration.kt
```

## Getting Started

### Prerequisites

- Android Studio with a JDK compatible with Android Gradle Plugin 8.10.1
- Android SDK 35
- An Android 7.0 (API 24) or newer device or emulator
- Internet access for Google Books requests and cover images

### Build

```bash
git clone https://github.com/shayann07/BookWiz.git
cd BookWiz
./gradlew assembleDebug
```

On Windows PowerShell, use `./gradlew.bat assembleDebug`. The current API calls do not attach a Google API key.

## Current Status and Limitations

- Result cards do not have click handling or a detail screen.
- There is no favorites feature, Room database, offline cache, Hilt/Dagger setup, or account system.
- The `SearchActivity` source and layout exist, but the activity is not declared in the manifest and no navigation to it was found; the active main screen uses inline search instead.
- The featured feed is a normal Google Books text query for `bestsellers`, not a verified bestseller ranking.
- Load errors do not have a dedicated retry or error-state UI.
- `local.properties` is tracked even though it normally contains machine-specific SDK configuration.
- Only generated example unit and instrumentation tests are present.
- A local `assembleDebug` attempt on June 12, 2026 did not complete within the three-minute verification window.
- No license file is included.
