package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquarePlay") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,3.0f)
                lineTo(19.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,21.0f)
                lineTo(19.0f,21.0f)
                lineTo(5.0f,21.0f)
                lineTo(3.0f,21.0f)
                lineTo(3.0f,3.0f)
                lineTo(5.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,9.003f)
                curveTo(8.99891f,8.641666f,9.192832f,8.307848f,9.507257f,8.129805f)
                curveTo(9.821684f,7.951761f,10.207704f,7.9571877f,10.517f,8.144f)
                lineTo(15.514f,11.141f)
                curveTo(15.816634f,11.321374f,16.002026f,11.64769f,16.002026f,12.0f)
                curveTo(16.002026f,12.35231f,15.816634f,12.678626f,15.514f,12.859f)
                lineTo(10.517f,15.856f)
                curveTo(10.20755f,16.042906f,9.821315f,16.04824f,9.506821f,15.869951f)
                curveTo(9.192327f,15.691663f,8.998547f,15.357512f,9.0f,14.996f)
                close()
            }
}

public val LucideIcons.All.SquarePlayDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquarePlay: ImageVector
    @Composable get() = SquarePlayDefinition.asImageVector()
