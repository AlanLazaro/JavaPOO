package com.company;

public class Video implements AcoesVideo
{
    private  String titulo;
    private int avaliação;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo)
    {
        this.titulo = titulo;
        this.avaliação = 0;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public int getAvaliação()
    {
        return avaliação;
    }

    public int getViews()
    {
        return views;
    }

    public int getCurtidas()
    {
        return curtidas;
    }

    public boolean isReproduzindo()
    {
        return reproduzindo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public void setAvaliação(int avaliação) {
        int nova;
        if(this.avaliação != 0){
            nova = (int) ((this.avaliação + avaliação)/2);
        }
        else{
            nova = avaliação;
        }
        this.avaliação = nova;
    }

    public void setViews(int views)
    {
        this.views = views;
    }

    public void setCurtidas(int curtidas)
    {
        this.curtidas = curtidas;
    }

    public void setReproduzindo(boolean reproduzindo)
    {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play()
    {
        this.reproduzindo = true;
    }

    @Override
    public void pause()
    {
        this.reproduzindo = false;
    }

    @Override
    public void like()
    {
        this.curtidas ++;
    }

    @Override
    public String toString()
    {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", avaliação=" + avaliação +
                ", views=" + views +
                ", curtidas=" + curtidas +
                ", reproduzindo=" + reproduzindo +
                '}';
    }
}

