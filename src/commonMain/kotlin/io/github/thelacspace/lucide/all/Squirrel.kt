package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Squirrel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.236f,22.0f)
                curveTo(16.020489f,21.123085f,16.219934f,19.868534f,15.746069f,18.79157f)
                curveTo(15.272204f,17.714605f,14.2125225f,17.01407f,13.036f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,20.0f)
                curveTo(16.0f,18.343145f,17.343145f,17.0f,19.0f,17.0f)
                lineTo(20.0f,17.0f)
                curveTo(21.10457f,17.0f,22.0f,16.10457f,22.0f,15.0f)
                lineTo(22.0f,13.0f)
                curveTo(22.0f,10.790861f,20.209139f,9.0f,18.0f,9.0f)
                lineTo(18.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,13.0f)
                lineTo(18.01f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,6.0f)
                curveTo(15.790861f,6.0f,14.0f,7.790861f,14.0f,10.0f)
                curveTo(10.1340065f,10.0f,7.0f,13.1340065f,7.0f,17.0f)
                curveTo(7.0f,12.0f,11.0f,12.0f,11.0f,6.5f)
                curveTo(11.007212f,4.887511f,10.151096f,3.394414f,8.75583f,2.5860806f)
                curveTo(7.3605623f,1.7777469f,5.6394377f,1.7777469f,4.2441707f,2.5860806f)
                curveTo(2.8489032f,3.394414f,1.9927887f,4.887511f,2.0f,6.5f)
                curveTo(2.0061553f,7.8763475f,3.1236386f,8.988845f,4.5f,8.988845f)
                curveTo(5.8763614f,8.988845f,6.993845f,7.8763475f,7.0f,6.5f)
                curveTo(7.0f,10.0f,3.0f,11.0f,3.0f,17.0f)
                curveTo(3.0f,19.8f,5.2f,22.0f,8.0f,22.0f)
                lineTo(18.0f,22.0f)
            }
}

public val LucideIcons.All.SquirrelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Squirrel: ImageVector
    @Composable get() = SquirrelDefinition.asImageVector()
