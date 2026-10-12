package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FlagTriangleRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,22.0)
                lineTo(6.0,2.799999952316284)
                curveTo(5.999753475189209,2.520167589187622,6.145740032196045,2.2605459690093994,6.384969711303711,2.1153724193573)
                curveTo(6.624199390411377,1.9701989889144897,6.921895503997803,1.9605772495269775,7.170000076293945,2.0899999141693115)
                lineTo(18.549999237060547,7.779999732971191)
                curveTo(18.825990676879883,7.913669109344482,19.00128746032715,8.193341255187988,19.00128746032715,8.5)
                curveTo(19.00128746032715,8.806657791137695,18.825990676879883,9.08633041381836,18.549999237060547,9.219999313354492)
                lineTo(6.0,15.5)
            }
}

public val LucideIcons.All.FlagTriangleRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FlagTriangleRight: ImageVector
    @Composable get() = FlagTriangleRightDefinition.asImageVector()
