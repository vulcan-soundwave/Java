package dao;

import entity.Equipbase;

public interface EquipbaseDao {
	Equipbase getEquipByEid(int eid);

	void insertEquipbase(Equipbase equip);

	void deleteByEid(int eid);
}
