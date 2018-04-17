package dao;

import entity.Equipment;

public interface EquipmentDao {
	Equipment getEquipmentByEid(int eid);

	Equipment getEquipmentByUid(int uid);

	void insert(Equipment e);

	void deleteByEid();

	void deleteByUid();

	void SetUpdataFlag(int eid);

	void SetConfirmFlag(int eid);
}
