package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pizza") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,14.0f)
                lineTo(11.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.75f,18.25f)
                lineTo(12.5f,19.67f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.775f,5.654f)
                curveTo(11.688584f,6.932664f,6.9331656f,11.68769f,5.6539993f,17.774f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.8f,9.3f)
                curveTo(16.683008f,9.887546f,15.439107f,12.075718f,16.01718f,14.195315f)
                curveTo(16.595251f,16.31491f,18.77784f,17.568586f,20.9f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.964f,20.732f)
                curveTo(22.061031f,21.079681f,21.963156f,21.452671f,21.707912f,21.707912f)
                curveTo(21.452671f,21.963156f,21.079681f,22.061031f,20.732f,21.964f)
                lineTo(2.7320004f,16.964f)
                curveTo(2.4764326f,16.89284f,2.2596145f,16.723043f,2.1292682f,16.491983f)
                curveTo(1.9989219f,16.260923f,1.9657308f,15.987538f,2.0370004f,15.732f)
                curveTo(3.8843915f,9.081181f,9.081181f,3.8843913f,15.732f,2.037f)
                curveTo(15.987538f,1.9657303f,16.260923f,1.9989214f,16.491983f,2.1292677f)
                curveTo(16.723043f,2.259614f,16.89284f,2.476432f,16.964f,2.7319999f)
                close()
            }
}

public val LucideIcons.All.PizzaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pizza: ImageVector
    @Composable get() = PizzaDefinition.asImageVector()
