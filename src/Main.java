
public class Main {
	public static void main(String[] args){
		Neuron neuron = new Neuron(239){

			@Override
			public void fire(float output) {
				System.out.println(output);
			}

			};
		
		neuron.tryData(new NeuronInput[]{
				new NeuronInput(1,-1),
				new NeuronInput(30,-2),
				new NeuronInput(100,10),
				new NeuronInput(7,2)
		});
	}
}
