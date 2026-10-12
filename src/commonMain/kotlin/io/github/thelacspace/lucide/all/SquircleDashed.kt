package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquircleDashed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.77f,3.043f)
                curveTo(12.590801f,2.981529f,11.4092f,2.981529f,10.2300005f,3.043f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.771f,20.956f)
                curveTo(12.591535f,21.019705f,11.4095f,21.020039f,10.23f,20.956999f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.18f,17.74f)
                curveTo(19.67f,18.89f,18.89f,19.67f,17.741001f,20.18f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.18f,6.259f)
                curveTo(19.67f,5.111f,18.889f,4.33f,17.74f,3.8209999f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.957f,10.23f)
                curveTo(21.020338f,11.409149f,21.020338f,12.59085f,20.957f,13.7699995f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.043f,10.23f)
                curveTo(2.9818273f,11.409549f,2.982161f,12.591485f,3.044f,13.771f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.26f,20.179f)
                curveTo(5.11f,19.671001f,4.3300004f,18.889f,3.8200002f,17.741001f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.26f,3.82f)
                curveTo(5.111f,4.33f,4.3300004f,5.111f,3.8200002f,6.26f)
            }
}

public val LucideIcons.All.SquircleDashedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquircleDashed: ImageVector
    @Composable get() = SquircleDashedDefinition.asImageVector()
