package com.github.malipatuljak.cubes;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertEquals;

public class CubesTest {
    @Rule
    public final SystemOutRule stdoutRule =
        new SystemOutRule()
            .mute()
            .enableLog();

    @Test
    public void testCubes() {
        final String cubes =   "  █────█\n ╱    ╱│\n█────█ │\n│    │ █\n│    │╱\n█────█\n\n   █────────█\n  ╱        ╱│\n ╱        ╱ │\n█────────█  │\n│        │  │\n│        │  █\n│        │ ╱\n│        │╱\n█────────█\n\n    █────────────█\n   ╱            ╱│\n  ╱            ╱ │\n ╱            ╱  │\n█────────────█   │\n│            │   │\n│            │   │\n│            │   █\n│            │  ╱\n│            │ ╱\n│            │╱\n█────────────█\n\n     █────────────────█\n    ╱                ╱│\n   ╱                ╱ │\n  ╱                ╱  │\n ╱                ╱   │\n█────────────────█    │\n│                │    │\n│                │    │\n│                │    │\n│                │    █\n│                │   ╱\n│                │  ╱\n│                │ ╱\n│                │╱\n█────────────────█\n\n      █────────────────────█\n     ╱                    ╱│\n    ╱                    ╱ │\n   ╱                    ╱  │\n  ╱                    ╱   │\n ╱                    ╱    │\n█────────────────────█     │\n│                    │     │\n│                    │     │\n│                    │     │\n│                    │     │\n│                    │     █\n│                    │    ╱\n│                    │   ╱\n│                    │  ╱\n│                    │ ╱\n│                    │╱\n█────────────────────█\n\n       █────────────────────────█\n      ╱                        ╱│\n     ╱                        ╱ │\n    ╱                        ╱  │\n   ╱                        ╱   │\n  ╱                        ╱    │\n ╱                        ╱     │\n█────────────────────────█      │\n│                        │      │\n│                        │      │\n│                        │      │\n│                        │      │\n│                        │      │\n│                        │      █\n│                        │     ╱\n│                        │    ╱\n│                        │   ╱\n│                        │  ╱\n│                        │ ╱\n│                        │╱\n█────────────────────────█\n\n        █────────────────────────────█\n       ╱                            ╱│\n      ╱                            ╱ │\n     ╱                            ╱  │\n    ╱                            ╱   │\n   ╱                            ╱    │\n  ╱                            ╱     │\n ╱                            ╱      │\n█────────────────────────────█       │\n│                            │       │\n│                            │       │\n│                            │       │\n│                            │       │\n│                            │       │\n│                            │       │\n│                            │       █\n│                            │      ╱\n│                            │     ╱\n│                            │    ╱\n│                            │   ╱\n│                            │  ╱\n│                            │ ╱\n│                            │╱\n█────────────────────────────█";
        startProgram();
        final String output = getStdoutLog();

        assertEquals(cubes, output);
    }

    private void startProgram() {
        Cubes.main(new String[]{});
    }

    private String getStdoutLog() {
        return stdoutRule
            .getLogWithNormalizedLineSeparator();
    }
}