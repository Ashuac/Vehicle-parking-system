package Vehicle;


public abstract class TwoWheel implements Roadvehicles
{
	public int wheels() {
	return 2;
	}}

	abstract class fourWheel implements Roadvehicles{
		public int wheels() {
			return 4;
		}
	}
	class bullet extends TwoWheel{
		public double space() {
			return 80;
		}
	}
	class activa extends TwoWheel{
		public double space() {
			return 50;
		}
	}
	class nano extends fourWheel{
		public double space() {
			return 100;
		}
	}
	class inova extends fourWheel{
		public double space() {
			return 200;
		}
	}
	class amphibian extends fourWheel implements Watervehicles{
		public double space() {
			return 250;
		}
		public int fins() {
			return 3;
		}
	}




	

