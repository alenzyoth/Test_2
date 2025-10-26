// ====================== CLASS TRACK ======================
/**
 * Mewakili satu trek lagu, turunan dari MediaItem.
 * Menambahkan informasi artis.
 */
class Track extends MediaItem {
    private String artist;

    /**
     * Membuat instance Track baru.
     * @param title Judul lagu.
     * @param artist Nama artis.
     */
    public Track(String title, String artist) {
        super(title);
        this.artist = artist;
    }
    /**
     * Mendapatkan nama artis.
     * @return String nama artis.
     */
    public String getArtist() {
        return artist;
    }
}