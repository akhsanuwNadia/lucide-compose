package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Shrimp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,2.0f)
                curveTo(10.603823f,3.2056756f,11.884009f,3.9189627f,13.227f,3.7979999f)
                lineTo(19.397f,3.237f)
                curveTo(20.25019f,3.1943045f,21.061012f,3.611379f,21.522442f,4.3302956f)
                curveTo(21.983871f,5.049212f,22.02537f,5.960069f,21.631224f,6.7179656f)
                curveTo(21.237078f,7.475862f,20.467539f,7.964937f,19.614f,8.0f)
                lineTo(8.5f,8.0f)
                curveTo(6.161669f,7.961412f,3.9861972f,9.19351f,2.8167424f,11.218765f)
                curveTo(1.6472876f,13.2440195f,1.6676737f,15.744085f,2.87f,17.75f)
                curveTo(4.0312624f,19.761366f,6.1774755f,21.000298f,8.5f,21.0f)
                curveTo(9.88f,21.0f,10.5f,20.5f,11.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,8.0f)
                curveTo(8.666667f,10.5f,8.666667f,13.5f,10.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,22.0f)
                curveTo(10.5f,21.5f,9.88f,21.0f,8.5f,21.0f)
                curveTo(7.1236525f,20.993845f,6.0111556f,19.876362f,6.0111556f,18.5f)
                curveTo(6.0111556f,17.123638f,7.1236525f,16.006155f,8.5f,16.0f)
                lineTo(12.0f,16.0f)
                curveTo(15.8659935f,16.0f,19.0f,12.8659935f,19.0f,9.0f)
                lineTo(19.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,12.0f)
                lineTo(13.01f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,16.0f)
                curveTo(6.0f,16.0f,3.5f,12.0f,4.0f,10.0f)
            }
}

public val LucideIcons.All.ShrimpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Shrimp: ImageVector
    @Composable get() = ShrimpDefinition.asImageVector()
