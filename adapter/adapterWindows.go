package main

import "fmt"

type adapterWindows struct {
	*windows
}

func (m *adapterWindows) insertIntoLightningPort() {
	fmt.Println("Adapter converts Lightning signal to USB.")
	m.windows.insertIntoUSBPort()
}
