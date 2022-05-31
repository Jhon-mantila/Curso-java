package threads;

import java.awt.geom.*;

import javax.swing.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class UsoThreads {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame marco=new MarcoRebote();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);

	}

}

//1. Creo clase q implementa la interfaz runnable
class Pelota_Hilos implements Runnable {
	
	public Pelota_Hilos(Pelota unaPelota, Component unComponente) {
		
		pelota = unaPelota;
		
		componente = unComponente;
	}
	
//2.  Escribir el código de la tarea dentro del método run	
	public void run() {
		
		System.out.println("Estado del hilo al comenzar " + Thread.currentThread().isInterrupted());
		//for (int i=1; i<=3000; i++){
			//while(!Thread.interrupted()) {
		
		while(!Thread.currentThread().isInterrupted()) {
			pelota.mueve_pelota(componente.getBounds());
			
			componente.paint(componente.getGraphics());
			
			try {
				
				Thread.sleep(4);
				
			} catch (InterruptedException e) {
				
				// TODO Auto-generated catch block
				//e.printStackTrace();
				//System.out.println("Hilo bloqueado imposible si interrupción");
				//System.exit(0);
				Thread.currentThread().interrupt();
			}
			
			
		}
		
		System.out.println("Estado del hilo al comenzar " + Thread.currentThread().isInterrupted());
		
	}
	
	private Pelota pelota;
	
	private Component componente;
	
	
}

//Movimiento de la pelota-----------------------------------------------------------------------------------------

class Pelota{
	
	// Mueve la pelota invirtiendo posición si choca con límites
	
	public void mueve_pelota(Rectangle2D limites){
		
		x+=dx;
		
		y+=dy;
		
		if(x<limites.getMinX()){
			
			x=limites.getMinX();
			
			dx=-dx;
		}
		
		if(x + TAMX>=limites.getMaxX()){
			
			x=limites.getMaxX() - TAMX;
			
			dx=-dx;
		}
		
		if(y<limites.getMinY()){
			
			y=limites.getMinY();
			
			dy=-dy;
		}
		
		if(y + TAMY>=limites.getMaxY()){
			
			y=limites.getMaxY()-TAMY;
			
			dy=-dy;
			
		}
		
	}
	
	//Forma de la pelota en su posición inicial
	
	public Ellipse2D getShape(){
		
		return new Ellipse2D.Double(x,y,TAMX,TAMY);
		
	}	
	
	private static final int TAMX=15;
	
	private static final int TAMY=15;
	
	private double x=0;
	
	private double y=0;
	
	private double dx=1;
	
	private double dy=1;
	
	
}

//Lámina que dibuja las pelotas----------------------------------------------------------------------


class LaminaPelota extends JPanel{
	
	//Añadimos pelota a la lámina
	
	public void add(Pelota b){
		
		pelotas.add(b);
	}
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D)g;
		
		for(Pelota b: pelotas){
			
			g2.fill(b.getShape());
		}
		
	}
	
	private ArrayList<Pelota> pelotas=new ArrayList<Pelota>();
}


//Marco con lámina y botones------------------------------------------------------------------------------

class MarcoRebote extends JFrame{
	
	public MarcoRebote(){
		
		setBounds(600,300,600,350);
		
		setTitle ("Rebotes");
		
		lamina=new LaminaPelota();
		
		add(lamina, BorderLayout.CENTER);
		
		JPanel laminaBotones=new JPanel();
		

		//Button #1
		arranca1 = new JButton("Hilo1");
		
		arranca1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evento) {
				// TODO Auto-generated method stub
				comienza_el_juego(evento);
			}
			
		});
		
		laminaBotones.add(arranca1);
		
		//Button #2
		arranca2 = new JButton("Hilo2");
		
		arranca2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				comienza_el_juego(e);
			}
			
		});
		
		laminaBotones.add(arranca2);
		
		//Button #3
		arranca3 = new JButton("Hilo3");
		
		arranca3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				comienza_el_juego(e);
			}
			
		});
		
		laminaBotones.add(arranca3);
		
		//Button Detener #1
		detener1 = new JButton("Detener1");
		
		detener1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				detener(e);
			}
			
		});
		
		laminaBotones.add(detener1);
		
		
		//Button Detener #2
		detener2 = new JButton("Detener2");
		
		detener2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				detener(e);
			}
			
		});
		
		laminaBotones.add(detener2);
		
		//Button Detener #3
		detener3= new JButton("Detener3");
		
		detener3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				detener(e);
			}
			
		});
		
		laminaBotones.add(detener3);
		
		/*ponerBoton(laminaBotones, "Dale!", new ActionListener(){
			
			public void actionPerformed(ActionEvent evento){
				
				comienza_el_juego();
			}
			
		});
		
		
		ponerBoton(laminaBotones, "Salir", new ActionListener(){
			
			public void actionPerformed(ActionEvent evento){
				
				System.exit(0);
				
			}
			
		});
		
		//Dibuja boton a interrupir
		ponerBoton(laminaBotones, "Detener", new ActionListener(){
			
			public void actionPerformed(ActionEvent evento){
				
				detener();
				
			}
			
		});*/
		
		add(laminaBotones, BorderLayout.SOUTH);
	}
	
	
	//Ponemos botones
	
	/*public void ponerBoton(Container c, String titulo, ActionListener oyente){
		
		JButton boton=new JButton(titulo);
		
		c.add(boton);
		
		boton.addActionListener(oyente);
		
	}*/
	
	//Añade pelota y la bota 1000 veces
	
	public void comienza_el_juego(ActionEvent e){
		
					
			Pelota pelota=new Pelota();
			
			lamina.add(pelota);
			
	//3. instanciar la clase creada y almacenar la instancia en varible de tipo runable
			
			Runnable r = new Pelota_Hilos(pelota, lamina);

			System.out.println("Evento: " + e.getSource());
			
			Object botonPulsado = e.getSource();
			
			if (botonPulsado == arranca1) {
			
	//4. crear instancia de la clase thread pasando como parámetro al constructor de thread el objeto runable anterior
			
			t = new Thread(r);
			
	//5. poner en marcha elhilo de ejecución con el método start() de la clase thread
			
			t.start();
			
			}else if(botonPulsado == arranca2) {
				
				t1 = new Thread(r);
				
				t1.start();
				
			}else if(botonPulsado == arranca3) {
				
				t2 = new Thread(r);
				
				t2.start();
				
			}
	}
	
	
	public void detener(ActionEvent e) {
		//método obsoleto		
		//t.stop();
		
		Object botonPulsado = e.getSource();
		
		if (botonPulsado == detener1) {
			t.interrupt();
		}else if(botonPulsado == detener2) {
			t1.interrupt();
		}else if(botonPulsado == detener3) {
			t2.interrupt();
		}
		
	
	}
	
	private Thread t,t1,t2;
	
	private LaminaPelota lamina;
	
	private JButton arranca1, arranca2, arranca3;
	
	private JButton detener1, detener2, detener3;
	
	
	
	
}

/*
 * 1. Crear una clase que implemente la interfaz runable (metodo run)
 * 2. Escribir el código de la tarea dentro del método run
 * 3. instanciar la clase creada y almacenar la instancia en varible de tipo runable
 * 4. crear instancia de la clase thread pasando como parámetro al constructor de thread el objeto runable anterior
 * 5. poner en marcha elhilo de ejecución con el método start() de la clase thread
 * */
