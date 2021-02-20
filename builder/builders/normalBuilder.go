package builders

import "github.com/felipefrmelo/builder/houses"

type normalBuilder struct {
	windowType string
	doorType   string
	floor      int
}

func newNormalBuilder() *normalBuilder {
	return &normalBuilder{}
}

func (b *normalBuilder) SetWindowType() {
	b.windowType = "Wooden Window"
}

func (b *normalBuilder) SetDoorType() {
	b.doorType = "Wooden Door"
}

func (b *normalBuilder) SetNumFloor() {
	b.floor = 2
}

func (b *normalBuilder) GetHouse() houses.House {
	return houses.House{
		WindowType: b.windowType,
		DoorType:   b.doorType,
		Floor:      b.floor,
	}
}
