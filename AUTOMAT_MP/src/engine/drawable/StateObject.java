package engine.drawable;

import jGame.model.game.GameObject;
import jGame.model.graphics.Camera;
import jGame.model.input.Input;
import jGame.model.physics.Physics2D;
import jGame.view.Renderer;

/**
 * Created by fukon on 7/12/2017.
 */
public class StateObject extends Physics2D implements GameObject {

    public StateObject(){
        super();
    }

    @Override
    public void reset() {

    }

    @Override
    public void input(Input input, long deltaTime, Camera camera) {

    }

    @Override
    public void logic(long deltaTime) {

    }

    @Override
    public void render(Renderer renderer, Camera camera) {

    }

    @Override
    public void close() {

    }
}
