package taller3.televisores;


public class TV{
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;
    private static int numTV = 0;

    public TV(Marca marca, boolean estado) {
      this.marca = marca;
      this.canal = 1;
      this.precio = 500;
      this.estado = estado;
      this.volumen = 1;
      this.control = null;
      numTV++;
    }
    public Marca getMarca() {
      return this.marca;
    }

      public void setMarca(Marca marca) {
          this.marca = marca;
      }

      public int getPrecio() {
          return this.precio;
      }

      public void setPrecio(int precio) {
          this.precio = precio;
      }


      public int getVolumen() {
          return this.volumen;
      }

      public void setVolumen(int volumen) {
        if (volumen>=0 && volumen<=7 && this.getEstado()) {
          this.volumen= volumen;
        }
      }

      public Control getControl() {
          return this.control;
      }

      public void setControl(Control control) {

        this.control = control;
      }

      public static int getNumTV() {
          return numTV;
      }

      public static void setNumTV(int numTV) {
          TV.numTV = numTV;
      }

      public void turnOn() {
          this.estado = true;
      }

      public void turnOff() {
          this.estado = false;
      }
      public boolean getEstado(){
          return this.estado;
      }

    public void canalUp(){
      this.setCanal(this.getCanal()+1);
    }

    public void canalDown(){
      this.setCanal(this.getCanal()-1);
    }
  public void setCanal(int canal) {
    if(this.getEstado() && canal>=1 && canal<=120) {
      this.canal = canal;
    }
  }
  public int getCanal() {
      return this.canal;
  }

    public void volumenUp(){
      this.setVolumen(this.getVolumen()+1);
      }

    public void volumenDown(){
      this.setVolumen(this.getVolumen()-1);
    }


  }
