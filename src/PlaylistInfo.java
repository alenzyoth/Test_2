// ====================== CLASS PLAYLISTINFO ======================
/**
 * Menyimpan data metadata untuk sebuah playlist.
 */
class PlaylistInfo {
    private String name;
    private String owner;

    /**
     * Membuat instance PlaylistInfo baru.
     * @param name Nama playlist.
     * @param owner Pemilik playlist.
     */
    public PlaylistInfo(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    /**
     * Mendapatkan nama playlist.
     * @return String nama playlist.
     */
    public String getName() {
        return name;
    }

    /**
     * Mendapatkan pemilik playlist.
     * @return String nama pemilik.
     */
    public String getOwner() {
        return owner;
    }
}
