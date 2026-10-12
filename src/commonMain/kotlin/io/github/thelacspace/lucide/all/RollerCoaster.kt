package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RollerCoaster") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,19.0f)
                lineTo(6.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,19.0f)
                lineTo(10.0f,6.8f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,19.0f)
                lineTo(14.0f,11.2f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,5.0f)
                lineTo(18.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,19.0f)
                lineTo(18.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,19.0f)
                lineTo(22.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,19.0f)
                lineTo(2.0f,9.0f)
                curveTo(2.0f,6.790861f,3.790861f,5.0f,6.0f,5.0f)
                curveTo(8.0f,5.0f,10.0f,6.33f,12.0f,9.0f)
                curveTo(14.0f,11.67f,16.0f,13.0f,18.0f,13.0f)
                curveTo(19.840364f,12.998273f,21.44206f,11.741043f,21.880877f,9.953758f)
                curveTo(22.31969f,8.166473f,21.482372f,6.3104157f,19.852068f,5.456568f)
                curveTo(18.221764f,4.60272f,16.219244f,4.9714527f,15.0f,6.35f)
            }
}

public val LucideIcons.All.RollerCoasterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RollerCoaster: ImageVector
    @Composable get() = RollerCoasterDefinition.asImageVector()
