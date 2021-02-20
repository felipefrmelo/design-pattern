package builders

import "github.com/felipefrmelo/builder/houses"

type IBuilder interface {
	SetWindowType()
	SetDoorType()
	SetNumFloor()
	GetHouse() houses.House
}

func GetBuilder(builderType string) IBuilder {
	if builderType == "normal" {
		return &normalBuilder{}
	}

	if builderType == "igloo" {
		return &iglooBuilder{}
	}
	return nil
}
