import java.util.Random;


public abstract class Neuron {
	public int[] weights;
	public int threshold;
	public Neuron neuron;
	Random random = new Random();
	
	public Neuron(int threshold){
		this.threshold = threshold;
	}
	
	public void tryData(NeuronInput[] inputs){
		int inputWeight = 0;
		for(int i = 0; i < inputs.length; i++){
			NeuronInput input = inputs[i];
			inputWeight += (input.input*input.weight)/inputs.length;
		}
		
		while(!(inputWeight >= this.threshold)){
			
			for(int i = 0; i < inputs.length; i++){
				NeuronInput input = inputs[i];
				inputWeight += (input.input*input.weight)/inputs.length;
			}
			
			for(int i = 0; i < inputs.length; i++){
				NeuronInput input = inputs[i];
				input.weight = (inputWeight - this.threshold)/inputs.length;
				System.out.println(input.weight);
			}
			
		}
		
		fire(inputWeight);
		
	}
	
	public abstract void fire(float output);
	
	private int chooseInt(int...ints){
		return ints[random.nextInt(ints.length)];
	}
}
