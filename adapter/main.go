package main

func main() {
	client := &client{}

	mac := &mac{}
	client.insertLightningConnectorIntoComputer(mac)

	windows := &windows{}
	adapterWindows := &adapterWindows{windows}
	client.insertLightningConnectorIntoComputer(adapterWindows)
}
