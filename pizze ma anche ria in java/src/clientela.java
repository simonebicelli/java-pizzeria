public class clientela {
    private String nome;
    private String cognome;
    private String indirizzo;
    private int numerotelefono;
    public clientela(String nome, String cognome, String indirizzo, int numerotelefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.numerotelefono = numerotelefono;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public String getIndirizzo() {
        return indirizzo;
    }
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
    public int getNumerotelefono() {
        return numerotelefono;
    }
    public void setNumerotelefono(int numerotelefono) {
        this.numerotelefono = numerotelefono;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
        result = prime * result + ((indirizzo == null) ? 0 : indirizzo.hashCode());
        result = prime * result + numerotelefono;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        clientela other = (clientela) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (cognome == null) {
            if (other.cognome != null)
                return false;
        } else if (!cognome.equals(other.cognome))
            return false;
        if (indirizzo == null) {
            if (other.indirizzo != null)
                return false;
        } else if (!indirizzo.equals(other.indirizzo))
            return false;
        if (numerotelefono != other.numerotelefono)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "clientela [nome=" + nome + ", cognome=" + cognome + ", indirizzo=" + indirizzo + ", numerotelefono="
                + numerotelefono + "]";
    }
}
