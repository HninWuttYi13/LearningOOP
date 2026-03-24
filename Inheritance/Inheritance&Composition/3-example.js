/**
 * Playlist and Song
 * Ask -> Is a Playlist a Song -> No
 * Ask -> Does Playlist contain Song -> Yes
 * So Playlist has a Song (composition)
 */
class Song {
  constructor(title, artist) {
    this.title = title;
    this.artist = artist;
  }
  play() {
    console.log(`${this.title} by ${this.artist} is playing...`);
  }
}
class Playlist {
  constructor() {
    this.songs = [];
  }
  addSong(song) {
    this.songs.push(song);
  }
}
const song1 = new Song("Opalite", "Taylor Swift");
const song2 = new Song("The Fate of Ophelia", "Taylor Swift");
const playlist = new Playlist();
playlist.addSong(song1);
playlist.addSong(song2);
playlist.songs.forEach((song) => song.play());
