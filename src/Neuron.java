
public abstract class Neuron {
	public int[] weights;
	public int threshold;
	public Neuron neuron;
	
	public Neuron(int threshold){
		this.threshold = threshold;
	}
	
	public void tryData(NeuronInput[] inputs){
		int inputWeight = 0;
		for(int i = 0; i < inputs.length; i++){
			NeuronInput input = inputs[i];
			inputWeight += input.input*input.weight;
		}
		
		if(inputWeight > this.threshold){
			fire(inputWeight);
		}
	}
	
	public abstract void fire(int output);
}
