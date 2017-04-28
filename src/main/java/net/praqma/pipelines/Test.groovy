package net.praqma.pipelines

class Test {
	static main(args) {
		def getMasterName ={branch ->
			branch.substring(0,branch.indexOf('ready'))+ "master"
		}
		
		def x = "greenbay/blu/ready/xyz"
		if (x.contains("ready")){
			println(getMasterName(x))
		}
	}
}
