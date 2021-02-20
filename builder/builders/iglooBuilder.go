package builders

import "github.com/felipefrmelo/builder/houses"

type iglooBuilder struct {
	windowType string
	doorType   string
	floor      int
}

func newIglooBuilder() *iglooBuilder {
	return &iglooBuilder{}
}

func (b *iglooBuilder) SetWindowType() {
	b.windowType = "Snow Window"
}

func (b *iglooBuilder) SetDoorType() {
	b.doorType = "Snow Door"
}

func (b *iglooBuilder) SetNumFloor() {
	b.floor = 1
}

func (b *iglooBuilder) GetHouse() houses.House {
	return houses.House{
		WindowType: b.windowType,
		DoorType:   b.doorType,
		Floor:      b.floor,
	}
}
