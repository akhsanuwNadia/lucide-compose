package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MegaphoneOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.636f,6.0f)
                curveTo(14.459438f,5.9347916f,17.184849f,4.951903f,19.4f,3.2f)
                curveTo(19.703018f,2.9727366f,20.108429f,2.9361806f,20.447214f,3.1055725f)
                curveTo(20.785997f,3.2749646f,21.0f,3.6212277f,21.0f,4.0f)
                lineTo(21.0f,15.344f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.378f,14.357f)
                curveTo(13.27246f,14.090771f,12.136767f,13.970747f,11.0f,14.0f)
                lineTo(5.0f,14.0f)
                curveTo(3.8954306f,14.0f,3.0f,13.104569f,3.0f,12.0f)
                lineTo(3.0f,8.0f)
                curveTo(3.0f,6.8954306f,3.8954306f,6.0f,5.0f,6.0f)
                lineTo(6.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,14.0f)
                curveTo(5.9999995f,16.596443f,6.842134f,19.122847f,8.4f,21.2f)
                curveTo(9.064586f,22.07791f,10.313773f,22.253515f,11.194645f,21.592861f)
                curveTo(12.075516f,20.932207f,12.256707f,19.683819f,11.599999f,18.800001f)
                curveTo(10.561422f,17.415232f,10.0f,15.730962f,10.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,8.0f)
                lineTo(8.0f,14.0f)
            }
}

public val LucideIcons.All.MegaphoneOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MegaphoneOff: ImageVector
    @Composable get() = MegaphoneOffDefinition.asImageVector()
