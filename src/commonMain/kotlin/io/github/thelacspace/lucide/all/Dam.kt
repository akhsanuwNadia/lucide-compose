package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Dam") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,11.31f)
                curveTo(12.17f,11.870001f,12.54f,13.0f,14.5f,13.0f)
                curveTo(17.0f,13.0f,17.0f,11.0f,19.5f,11.0f)
                curveTo(20.8f,11.0f,21.4f,11.5f,22.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.75f,18.0f)
                curveTo(12.1f,18.5f,13.2f,19.0f,14.5f,19.0f)
                curveTo(17.0f,19.0f,17.0f,17.0f,19.5f,17.0f)
                curveTo(20.8f,17.0f,21.4f,17.5f,22.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,10.0f)
                lineTo(6.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,14.0f)
                lineTo(6.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,18.0f)
                lineTo(6.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,6.0f)
                lineTo(6.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,3.0f)
                curveTo(6.4477153f,3.0f,6.0f,3.4477153f,6.0f,4.0f)
                lineTo(6.0f,20.0f)
                curveTo(6.0f,20.552284f,6.4477153f,21.0f,7.0f,21.0f)
                lineTo(11.0f,21.0f)
                curveTo(11.552285f,21.0f,12.0f,20.552284f,12.0f,20.0f)
                lineTo(10.0f,4.0f)
                curveTo(10.0f,3.4477153f,9.552285f,3.0f,9.0f,3.0f)
                close()
            }
}

public val LucideIcons.All.DamDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Dam: ImageVector
    @Composable get() = DamDefinition.asImageVector()
