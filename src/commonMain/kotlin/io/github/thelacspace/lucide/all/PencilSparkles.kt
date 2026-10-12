package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PencilSparkles") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,3.0f)
                lineTo(8.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.007f,5.008f)
                lineTo(18.994f,8.9939995f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,15.0f)
                lineTo(20.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.174f,6.813f)
                curveTo(22.222715f,5.703752f,22.198393f,3.9614058f,21.119122f,2.8818638f)
                curveTo(20.03985f,1.802322f,18.29751f,1.7775623f,17.188f,2.8260002f)
                lineTo(3.842f,16.175f)
                curveTo(3.6098194f,16.4065f,3.4381137f,16.69153f,3.342f,17.005f)
                lineTo(2.021f,21.356998f)
                curveTo(1.9683454f,21.533194f,2.0166585f,21.724072f,2.1467962f,21.854f)
                curveTo(2.276934f,21.983929f,2.4678895f,22.031937f,2.644f,21.978998f)
                lineTo(6.997f,20.658998f)
                curveTo(7.310169f,20.56375f,7.5951734f,20.393091f,7.827f,20.161999f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,17.0f)
                lineTo(18.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,5.0f)
                lineTo(4.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,7.0f)
                lineTo(2.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,2.0f)
                lineTo(9.0f,4.0f)
            }
}

public val LucideIcons.All.PencilSparklesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PencilSparkles: ImageVector
    @Composable get() = PencilSparklesDefinition.asImageVector()
