package xyz.fteychene.state.command;


import xyz.fteychene.state.state.Idle;
import xyz.fteychene.state.state.Waiting;

public record Experiment() implements Command<Idle, Waiting> {
}
