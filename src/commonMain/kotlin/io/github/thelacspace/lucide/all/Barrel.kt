package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Barrel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,3.0)
                curveTo(8.666666984558105,8.925926208496094,8.666666984558105,15.074073791503906,10.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,3.0)
                curveTo(15.333333015441895,8.925926208496094,15.333333015441895,15.074073791503906,14.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.996999740600586,21.0)
                curveTo(17.676984786987305,20.99886703491211,18.3098087310791,20.652320861816406,18.677000045776367,20.079999923706055)
                curveTo(21.76563262939453,15.136076927185059,21.76563262939453,8.863923072814941,18.677000045776367,3.9200000762939453)
                curveTo(18.3098087310791,3.347679615020752,17.676984786987305,3.0011327266693115,16.996999740600586,3.0)
                lineTo(6.996999740600586,3.0)
                curveTo(6.316660404205322,3.000792980194092,5.683382987976074,3.347381591796875,5.315999984741211,3.9200000762939453)
                curveTo(2.2273683547973633,8.863923072814941,2.2273683547973633,15.136076927185059,5.315999984741211,20.079999923706055)
                curveTo(5.683382987976074,20.652618408203125,6.316660404205322,20.99920654296875,6.996999740600586,21.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.5399999618530273,16.0)
                lineTo(20.453998565673828,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.5399999618530273,8.0)
                lineTo(20.453998565673828,8.0)
            }
}

public val LucideIcons.All.BarrelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Barrel: ImageVector
    @Composable get() = BarrelDefinition.asImageVector()
