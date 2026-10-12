package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Scooter") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0f,4.0f)
                lineTo(17.5f,4.0f)
                lineTo(19.5f,15.05f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.95f,17.0f)
                lineTo(12.092f,17.0f)
                curveTo(12.615f,17.0f,13.042f,16.594f,13.155f,16.084f)
                curveTo(13.736629f,13.473785f,15.857569f,11.486174f,18.5f,11.075f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,17.5f)
                curveTo(16.995995f,18.395828f,17.471613f,19.225325f,18.246761f,19.6744f)
                curveTo(19.02191f,20.123474f,19.97809f,20.123474f,20.753239f,19.6744f)
                curveTo(21.528387f,19.225325f,22.004005f,18.395828f,22.0f,17.5f)
                curveTo(22.004005f,16.604172f,21.528387f,15.774674f,20.753239f,15.325601f)
                curveTo(19.97809f,14.876526f,19.02191f,14.876526f,18.246761f,15.325601f)
                curveTo(17.471613f,15.774674f,16.995995f,16.604172f,17.0f,17.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,17.5f)
                curveTo(1.9959937f,18.395828f,2.471613f,19.225325f,3.2467613f,19.6744f)
                curveTo(4.0219097f,20.123474f,4.9780903f,20.123474f,5.7532387f,19.6744f)
                curveTo(6.528387f,19.225325f,7.0040064f,18.395828f,7.0f,17.5f)
                curveTo(7.0040064f,16.604172f,6.528387f,15.774674f,5.7532387f,15.325601f)
                curveTo(4.9780903f,14.876526f,4.0219097f,14.876526f,3.2467613f,15.325601f)
                curveTo(2.471613f,15.774674f,1.9959937f,16.604172f,2.0f,17.5f)
            }
}

public val LucideIcons.All.ScooterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Scooter: ImageVector
    @Composable get() = ScooterDefinition.asImageVector()
