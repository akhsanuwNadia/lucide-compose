package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TowerControl") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.200000762939453,12.270000457763672)
                lineTo(20.0,6.0)
                lineTo(4.0,6.0)
                lineTo(5.800000190734863,12.270000457763672)
                curveTo(5.919723987579346,12.697093963623047,6.3064799308776855,12.994285583496094,6.75,13.0)
                lineTo(17.25,13.0)
                curveTo(17.697237014770508,12.998720169067383,18.08924674987793,12.700630187988281,18.209999084472656,12.270000457763672)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,13.0)
                lineTo(8.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,22.0)
                lineTo(16.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,6.0)
                lineTo(10.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,6.0)
                lineTo(14.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,6.0)
                lineTo(12.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,2.0)
                lineTo(11.0,2.0)
            }
}

public val LucideIcons.All.TowerControlDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TowerControl: ImageVector
    @Composable get() = TowerControlDefinition.asImageVector()
