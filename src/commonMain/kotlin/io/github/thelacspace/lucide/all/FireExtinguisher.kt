package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FireExtinguisher") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,6.5)
                lineTo(15.0,3.0)
                curveTo(15.0,2.4477152824401855,14.552285194396973,2.0,14.0,2.0)
                lineTo(12.0,2.0)
                curveTo(11.447714805603027,2.0,11.0,2.4477152824401855,11.0,3.0)
                lineTo(11.0,6.5)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,18.0)
                lineTo(17.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,3.0)
                lineTo(15.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,3.0)
                curveTo(7.686291694641113,3.0,5.0,5.686291694641113,5.0,9.0)
                lineTo(5.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,13.0)
                lineTo(9.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,10.0)
                curveTo(16.99015235900879,7.7978434562683105,15.202178001403809,6.017848491668701,13.0,6.017848491668701)
                curveTo(10.797821998596191,6.017848491668701,9.009848594665527,7.7978434562683105,9.0,10.0)
                lineTo(9.0,20.0)
                curveTo(9.0,21.104570388793945,9.895430564880371,22.0,11.0,22.0)
                lineTo(15.0,22.0)
                curveTo(16.104570388793945,22.0,17.0,21.104570388793945,17.0,20.0)
                close()
            }
}

public val LucideIcons.All.FireExtinguisherDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FireExtinguisher: ImageVector
    @Composable get() = FireExtinguisherDefinition.asImageVector()
