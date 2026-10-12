package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareSparkles") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,15.0f)
                lineTo(7.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.41f,2.49f)
                curveTo(15.462598f,2.2055228f,15.710701f,1.9990864f,16.0f,1.9990864f)
                curveTo(16.289299f,1.9990864f,16.537403f,2.2055228f,16.59f,2.49f)
                lineTo(17.22f,5.8240004f)
                curveTo(17.312119f,6.3085527f,17.69135f,6.6873884f,18.175999f,6.7790003f)
                lineTo(21.509998f,7.4100003f)
                curveTo(21.794476f,7.4625983f,22.00091f,7.710702f,22.00091f,8.0f)
                curveTo(22.00091f,8.289299f,21.794476f,8.537402f,21.509998f,8.59f)
                lineTo(18.175999f,9.22f)
                curveTo(17.691446f,9.3121195f,17.31261f,9.691352f,17.220999f,10.176001f)
                lineTo(16.589998f,13.51f)
                curveTo(16.537401f,13.794477f,16.289297f,14.000914f,15.999998f,14.000914f)
                curveTo(15.710699f,14.000914f,15.462596f,13.794477f,15.409998f,13.51f)
                lineTo(14.779998f,10.176001f)
                curveTo(14.687879f,9.691448f,14.308646f,9.312613f,13.8239975f,9.221001f)
                lineTo(10.49f,8.59f)
                curveTo(10.2055235f,8.537402f,9.999087f,8.289299f,9.999087f,8.0f)
                curveTo(9.999087f,7.710702f,10.2055235f,7.4625983f,10.49f,7.4100003f)
                lineTo(13.823999f,6.78f)
                curveTo(14.308552f,6.6878815f,14.687387f,6.308649f,14.778999f,5.8240004f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,13.0f)
                lineTo(21.0f,19.0f)
                curveTo(21.0f,20.10457f,20.10457f,21.0f,19.0f,21.0f)
                lineTo(5.0f,21.0f)
                curveTo(3.8954306f,21.0f,3.0f,20.10457f,3.0f,19.0f)
                lineTo(3.0f,5.0f)
                curveTo(3.0f,3.8954306f,3.8954306f,3.0f,5.0f,3.0f)
                lineTo(11.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,13.0f)
                lineTo(9.0f,17.0f)
            }
}

public val LucideIcons.All.SquareSparklesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareSparkles: ImageVector
    @Composable get() = SquareSparklesDefinition.asImageVector()
