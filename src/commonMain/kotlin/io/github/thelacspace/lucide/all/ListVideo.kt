package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListVideo") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0f,5.0f)
                lineTo(3.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,12.0f)
                lineTo(3.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,19.0f)
                lineTo(3.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,12.003f)
                curveTo(14.99891f,11.641666f,15.192832f,11.307848f,15.507257f,11.129805f)
                curveTo(15.821684f,10.951761f,16.207703f,10.957188f,16.517f,11.144f)
                lineTo(21.514f,14.141f)
                curveTo(21.816635f,14.321374f,22.002026f,14.64769f,22.002026f,15.0f)
                curveTo(22.002026f,15.35231f,21.816635f,15.678626f,21.514f,15.859f)
                lineTo(16.517f,18.856f)
                curveTo(16.20755f,19.042908f,15.821314f,19.048243f,15.50682f,18.869953f)
                curveTo(15.192326f,18.691664f,14.998547f,18.357513f,15.0f,17.996f)
                close()
            }
}

public val LucideIcons.All.ListVideoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListVideo: ImageVector
    @Composable get() = ListVideoDefinition.asImageVector()
