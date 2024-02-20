Overview
This project demonstrates automated testing of Spotify functionalities using Selenium WebDriver. The automation script performs the following tasks:

Logs into Spotify.
Searches for a playlist by name.
Plays a song from the playlist and pauses it with explicit wait.
Searches for a podcast.
Plays the podcast.
Logs out of Spotify.
Project Flow
Login to Spotify:

The automation script navigates to the Spotify login page and logs in with valid credentials.
Search for Playlist:

After logging in, the script searches for a specific playlist by name.
Play a Song from Playlist:

Once the playlist is found, the script selects and plays a song from it.
It utilizes explicit wait to ensure the song is fully loaded before pausing it.
Search for Podcast:

Following the song playback, the script clears the search field and proceeds to search for a podcast by name.
Play the Podcast:

Upon finding the desired podcast, the script plays it.
Logout from Spotify:

Finally, the automation script logs out of the Spotify account.
