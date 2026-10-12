package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("StarMinus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,18.0f)
                lineTo(21.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.688f,14.0f)
                curveTo(17.793715f,13.788606f,17.934357f,13.596574f,18.104f,13.432f)
                lineTo(21.84f,9.794001f)
                curveTo(21.985075f,9.653216f,22.037426f,9.442164f,21.974968f,9.2499f)
                curveTo(21.912508f,9.057635f,21.746115f,8.917646f,21.546f,8.889001f)
                lineTo(16.38f,8.134001f)
                curveTo(15.688538f,8.036568f,15.090736f,7.6018033f,14.784999f,6.974001f)
                lineTo(12.474998f,2.294001f)
                curveTo(12.385414f,2.113487f,12.201209f,1.9993951f,11.999688f,1.9996072f)
                curveTo(11.798167f,1.9998193f,11.6142025f,2.1142988f,11.524999f,2.295001f)
                lineTo(9.216f,6.974f)
                curveTo(8.909877f,7.602337f,8.311203f,8.03719f,7.6189995f,8.134f)
                lineTo(2.4539995f,8.889f)
                curveTo(2.2534487f,8.9173565f,2.0865955f,9.057535f,2.0240781f,9.250191f)
                curveTo(1.9615607f,9.442847f,2.014312f,9.654288f,2.1599996f,9.795f)
                lineTo(5.896f,13.432f)
                curveTo(6.4000006f,13.9174185f,6.6291075f,14.621987f,6.507f,15.311f)
                lineTo(5.627f,20.45f)
                curveTo(5.592306f,20.649048f,5.6738024f,20.850506f,5.8371325f,20.969444f)
                curveTo(6.000462f,21.088385f,6.2172093f,21.104113f,6.396f,21.01f)
                lineTo(11.0130005f,18.582f)
                lineTo(11.040001f,18.568f)
            }
}

public val LucideIcons.All.StarMinusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.StarMinus: ImageVector
    @Composable get() = StarMinusDefinition.asImageVector()
