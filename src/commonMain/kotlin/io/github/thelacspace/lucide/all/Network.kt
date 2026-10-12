package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Network") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f,16.0f)
                lineTo(21.0f,16.0f)
                lineTo(22.0f,16.0f)
                lineTo(22.0f,22.0f)
                lineTo(21.0f,22.0f)
                lineTo(17.0f,22.0f)
                lineTo(16.0f,22.0f)
                lineTo(16.0f,16.0f)
                lineTo(17.0f,16.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,16.0f)
                lineTo(7.0f,16.0f)
                lineTo(8.0f,16.0f)
                lineTo(8.0f,22.0f)
                lineTo(7.0f,22.0f)
                lineTo(3.0f,22.0f)
                lineTo(2.0f,22.0f)
                lineTo(2.0f,16.0f)
                lineTo(3.0f,16.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,2.0f)
                lineTo(14.0f,2.0f)
                lineTo(15.0f,2.0f)
                lineTo(15.0f,8.0f)
                lineTo(14.0f,8.0f)
                lineTo(10.0f,8.0f)
                lineTo(9.0f,8.0f)
                lineTo(9.0f,2.0f)
                lineTo(10.0f,2.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,16.0f)
                lineTo(5.0f,13.0f)
                curveTo(5.0f,12.447715f,5.4477153f,12.0f,6.0f,12.0f)
                lineTo(18.0f,12.0f)
                curveTo(18.552284f,12.0f,19.0f,12.447715f,19.0f,13.0f)
                lineTo(19.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,12.0f)
                lineTo(12.0f,8.0f)
            }
}

public val LucideIcons.All.NetworkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Network: ImageVector
    @Composable get() = NetworkDefinition.asImageVector()
