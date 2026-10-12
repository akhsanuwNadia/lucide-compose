package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Helicopter") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,17.0f)
                lineTo(11.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,3.0f)
                lineTo(14.0f,11.0f)
                curveTo(14.0f,12.104569f,14.895431f,13.0f,16.0f,13.0f)
                lineTo(21.865f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,17.0f)
                lineTo(17.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,17.0f)
                curveTo(20.209139f,17.0f,22.0f,15.209139f,22.0f,13.0f)
                curveTo(22.0f,9.686292f,18.418278f,7.0f,14.0f,7.0f)
                curveTo(10.686292f,7.0f,8.0f,9.238576f,8.0f,12.0f)
                lineTo(8.0f,15.0f)
                curveTo(8.0f,16.10457f,8.895431f,17.0f,10.0f,17.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,10.0f)
                lineTo(2.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,3.0f)
                lineTo(22.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,21.0f)
                lineTo(21.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,13.0f)
                lineTo(2.0f,13.0f)
            }
}

public val LucideIcons.All.HelicopterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Helicopter: ImageVector
    @Composable get() = HelicopterDefinition.asImageVector()
