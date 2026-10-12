package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BadgeIndianRupee") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.85f,8.62f)
                curveTo(3.5533524f,7.2837443f,3.960577f,5.888586f,4.9294686f,4.921721f)
                curveTo(5.8983607f,3.9548564f,7.2943687f,3.5505545f,8.63f,3.85f)
                curveTo(9.365069f,2.700381f,10.635468f,2.0047855f,12.0f,2.0047855f)
                curveTo(13.364532f,2.0047855f,14.634931f,2.700381f,15.37f,3.85f)
                curveTo(16.707739f,3.5492356f,18.10631f,3.9546168f,19.075846f,4.9241533f)
                curveTo(20.045383f,5.8936906f,20.450764f,7.2922616f,20.15f,8.63f)
                curveTo(21.299618f,9.365069f,21.995214f,10.635468f,21.995214f,12.0f)
                curveTo(21.995214f,13.364532f,21.299618f,14.634931f,20.15f,15.37f)
                curveTo(20.449446f,16.705631f,20.045143f,18.101639f,19.078278f,19.070532f)
                curveTo(18.111414f,20.039423f,16.716255f,20.446648f,15.379999f,20.15f)
                curveTo(14.645832f,21.304111f,13.372835f,22.003054f,12.004999f,22.003054f)
                curveTo(10.637163f,22.003054f,9.364166f,21.304111f,8.629999f,20.15f)
                curveTo(7.294368f,20.449446f,5.8983593f,20.045143f,4.9294677f,19.078278f)
                curveTo(3.9605758f,18.111414f,3.5533512f,16.716255f,3.849999f,15.379999f)
                curveTo(2.6913755f,14.646753f,1.989064f,13.371151f,1.989064f,11.999999f)
                curveTo(1.989064f,10.628847f,2.6913755f,9.353245f,3.849999f,8.619999f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,8.0f)
                lineTo(16.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,12.0f)
                lineTo(16.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,17.0f)
                lineTo(8.0f,16.0f)
                lineTo(9.0f,16.0f)
                curveTo(11.202156f,15.990151f,12.982151f,14.202178f,12.982151f,12.0f)
                curveTo(12.982151f,9.797822f,11.202156f,8.009849f,9.0f,8.0f)
            }
}

public val LucideIcons.All.BadgeIndianRupeeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BadgeIndianRupee: ImageVector
    @Composable get() = BadgeIndianRupeeDefinition.asImageVector()
