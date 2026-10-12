package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Mosque") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.268f,2.0f)
                curveTo(11.721726f,2.9562712f,12.051144f,4.174225f,13.004962f,4.7247696f)
                curveTo(13.95878f,5.275314f,15.178195f,4.951347f,15.733f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,5.0f)
                lineTo(14.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,22.0f)
                lineTo(16.0f,19.0f)
                curveTo(15.995076f,17.898922f,15.1010895f,17.008924f,14.0f,17.008924f)
                curveTo(12.8989105f,17.008924f,12.004924f,17.898922f,12.0f,19.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,13.0f)
                curveTo(20.338f,11.503f,19.334f,10.247f,18.1f,9.37f)
                curveTo(16.825f,8.47f,15.422f,8.0f,14.0f,8.0f)
                curveTo(12.578f,8.0f,11.174f,8.47f,9.9f,9.37f)
                curveTo(8.668f,10.248f,7.663f,11.504f,7.0f,13.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,9.0f)
                lineTo(7.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,22.0f)
                lineTo(7.0f,6.0f)
                curveTo(7.0f,4.4262133f,6.2590294f,2.9442718f,5.0f,2.0f)
                curveTo(3.7409708f,2.9442718f,3.0f,4.4262133f,3.0f,6.0f)
                lineTo(3.0f,20.0f)
                curveTo(3.0f,21.10457f,3.8954306f,22.0f,5.0f,22.0f)
                lineTo(19.0f,22.0f)
                curveTo(20.10457f,22.0f,21.0f,21.10457f,21.0f,20.0f)
                lineTo(21.0f,13.0f)
            }
}

public val LucideIcons.All.MosqueDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Mosque: ImageVector
    @Composable get() = MosqueDefinition.asImageVector()
