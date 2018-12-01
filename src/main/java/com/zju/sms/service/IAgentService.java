package com.zju.sms.service;

import com.zju.sms.domain.Agent;

import java.util.List;

public interface IAgentService {
    void save(Agent agent);
    void delete(String agentId);
    void update(Agent agent);
    Agent get(String agentId);
    List<Agent> getAll();
    Agent getByUsername(String username);
}
