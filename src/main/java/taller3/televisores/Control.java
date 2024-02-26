package taller3.televisores;

public class Control{
	  private TV tv;

	  public void canalUp(){
	    if (this.tv.getEstado() & this.tv.getCanal()<120){
	      this.tv.setCanal(this.tv.getCanal()+1);
	    }
	  }

	  public void canalDown(){
	    if (this.tv.getEstado() & this.tv.getCanal()>1)
	      this.tv.setCanal(this.tv.getCanal()-1);
	  }

	  public void volumenUp(){
	    if (this.tv.getEstado() & this.tv.getVolumen()<7)
	      this.tv.setVolumen(this.tv.getVolumen()+1);
	    }

	  public void volumenDown(){
	    if (this.tv.getEstado() & this.tv.getVolumen()>0)
	      this.tv.setVolumen(this.tv.getVolumen()-1);

	  
	  }

	  public void enlazar(TV tv){
	    this.tv = tv;
	    tv.setControl(this);
	  }
	    public void turnOn() {
	        this.tv.turnOn();
	    }

	    public void turnOff() {
	        this.tv.turnOff();
	    }
	    public void setCanal(int canal) {
	    	if (canal>=1 & canal<=120) {
	    		this.tv.setCanal(canal);
	    	}
	    }
	    public void setVolumen(int volumen) {
	    	if (volumen>=0 & volumen<=7) {
	    		this.tv.setVolumen(volumen);
	    	}
	    }
	    public TV getTv() {
	    	return this.tv;
	    }
	    
	    public void setTv(TV tv) {
	    	this.tv=tv;
	    }
	    
	}
